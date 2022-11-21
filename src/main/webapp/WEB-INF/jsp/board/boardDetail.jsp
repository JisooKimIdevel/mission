<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="/lib/jquery-3.6.1.min.js" />
<script src="/js/board/board.js" />
<div>
    <h3>게시판 상세</h3>
</div>
<div>
    <form id="boardDetailForm" method="post" action="/board/boardUpdatePage">
        <table>
            <tr>
                <td>
                    <input type="text" id="detailBoardTitle" name="boardTitle" value="" readonly>
                    <input type="hidden" id="detailBoardSeq" name="boardSeq">
                </td>
            </tr>
            <tr><td><textarea id="detailBoardCont" name="boardCont" value="" readonly></textarea></td></tr>
            <tr>
                <td>
                    <button type="submit">수정</button>
                    <a href="javascript:;" onclick="boardDelete();">삭제</a>
                </td>
            </tr>
        </table>
    </form>
</div>
