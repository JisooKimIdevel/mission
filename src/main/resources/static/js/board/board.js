$(function() {
    boardList();
});

function boardList() {
    $.ajax({
        type : "POST",
        url : "/board/boardList",
        data : $("#boardListForm").serialize(),
        dataType : "json",
        success : function (data) {
            var cont = "";
            var rtData = data.list;
            if(rtData.length != 0) {
                for (var i = 0; i < rtData.length; i++) {
                    var rt = rtData[i];
                    cont += "<tr onclick='location.href=`/board/boardDetail?boardSeq=" + rt.boardSeq + "`; boardSel("+rt.boardSeq+");'>";
                    cont += "   <td></td>";
                    cont += "   <td>" + rt.boardTitle + "</td>";
                    cont += "   <td>" + rt.boardCont + "</td>";
                    cont += "   <td>" + rt.regId + "</td>";
                    cont += "</tr>";
                }
            } else {
                cont += "<tr><td colspan='4'>No Data</td></tr>"
            }
            $("#boardList").html(cont);
        }
    });
}
function boardSel(boardSeq) {
    $.ajax({
        type : "POST",
        url : "/board/boardSel",
        data : {"boardSeq" : boardSeq},
        dataType: "json",
        success : function (data) {
            var info = Object.values(data.boardInfo);
            $("#detailBoardTitle").val(info[0].boardTitle);
            $("#detailBoardCont").val(info[0].boardCont);
        }
    })

}
function boardInsert() {
    var boardTitle = $("#insertBoardTitle").val();
    var boardCont = $("#insertBoardCont").val();
    // var errorTxt = "";
    // if(boardTitle == "") {
    //     errorTxt += "제목을 입력해 주세요.<br>";
    // }
    // if(boardCont == "") {
    //     errorTxt += "내용을 입력해 주세요.<br>";
    // }
    //
    // if(errorTxt != null) {
    //     return alert(errorTxt);
    // }
    $.ajax({
        type : "POST",
        url : "/board/boardInsert",
        data : {"boardTitle" : boardTitle, "boardCont" : boardCont},
        dataType : "json",
        success : function (data) {
                alert("등록 성공");
                location.href="/board/";
                boardList();
        }
    })
}
function boardUpdate() {
    var boardTitle = $("#updateBoardTitle").val();
    var boardCont = $("#updateBoardCont").val();

    // var errorTxt = "";
    // if(boardTitle == "") {
    //     errorTxt += "제목을 입력해 주세요.<br>";
    // }
    // if(boardCont == "") {
    //     errorTxt += "내용을 입력해 주세요.<br>";
    // }
    //
    // if(errorTxt != null) {
    //     return alert(errorTxt);
    // }
    var boardSeq = $("#updateBoardSeq").val();
    $.ajax({
        type : "POST",
        url : "/board/boardUpdate",
        data : {"boardSeq" : boardSeq},
        dataType : "json",
        success : function (data) {
            if(data.result != 0) {
                alert("수정 성공");
            } else {
                alert("수정 실패");
            }
        }
    })
}
function boardDelete() {
    var boardSeq = $("#detailBoardSeq").val();
    if(confirm("삭제하시겠습니까?")) {
        $.ajax({
            type : "POST",
            url : "/board/boardDelete",
            data : {"boardSeq" : boardSeq},
            dataType : "json",
            success : function (data) {
                if(data.result != 0) {
                    alert("삭제 성공");
                } else {
                    alert("삭제 실패");
                }
            }
        })
    }
}