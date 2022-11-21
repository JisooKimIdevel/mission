<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="/lib/jquery-3.6.1.min.js" />
<script src="/js/board/board.js" />
<div>
    <h3>게시판 수정</h3>
</div>
<div>
    <form id="boardUpdateForm" method="post" onsubmit="return false">
        <table>
            <tr>
                <td>
                    <input type="text" id="updateBoardTitle" name="boardTitle" maxlength="50">
                    <input type="hidden" id="updateBoardSeq" name="boardSeq">
                </td>
            </tr>
            <tr><td><textarea id=updateBoardCont" name="boardCont" maxlength="1000"></textarea></td></tr>
        </table>
    </form>
    <a href="javascript:;" onclick="boardUpdate();">수정</a>
</div>
