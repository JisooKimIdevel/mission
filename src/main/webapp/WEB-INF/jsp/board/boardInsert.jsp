<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="/lib/jquery-3.6.1.min.js"></script>
<script src="/js/board/board.js"></script>
<div>
    <h3>게시판 글쓰기</h3>
</div>
<div>
    <form id="boardInsertForm" method="post" onsubmit="return false">
        <table>
            <tr><td><input type="text" id="insertBoardTitle" name="boardTitle" maxlength="50"></td></tr>
            <tr><td><textarea id="insertBoardCont" name="boardCont" maxlength="1000"></textarea></td></tr>
        </table>
    </form>
    <a href="javascript:;" onclick="boardInsert();">글쓰기</a>
</div>
