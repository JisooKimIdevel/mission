<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script src="/lib/jquery-3.6.1.min.js"></script>
<script src="/js/board/board.js"></script>
<div>
    <h3>게시판 목록</h3>
</div>
<div>
    <form id="boardListForm" method="post" onsubmit="return false">
        <table>
            <colgroup>
                <col>
                <col>
                <col>
                <col>
            </colgroup>
            <thead>
                <th>번호</th>
                <th>제목</th>
                <th>내용</th>
                <th>작성자</th>
            </thead>
            <tbody id="boardList">
            </tbody>
        </table>
    </form>
    <a href="/board/boardInsertPage">글쓰기</a>
</div>

