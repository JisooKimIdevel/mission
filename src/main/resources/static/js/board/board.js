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
            alert(data);
            var cont = "";
            var rtData = data.list;
            // if(rtData.length() != 0) {
                for (var i = 0; i < rtData.length; i++) {
                    var rt = rtData[i];
                    cont += "<tr>";
                    cont += "   <td>-</td>";
                    cont += "   <td>" + rt.boardTitle + "</td>";
                    cont += "   <td>" + rt.boardCont + "</td>";
                    cont += "   <td>" + rt.regId + "</td>";
                    cont += "</tr>";
                }
            // } else {
            //     cont += "<tr><td colspan='4'>No Data</td></tr>"
            // }
            $("#boardList").html(cont);
        },
        error : function (data) {
            console.log(data)
        }
    });


}