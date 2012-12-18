<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<div>
    <nav>
        <c:forEach var="navEntry" items="${navigatePath}" varStatus="status">
            <c:if test="${not status.last}">
                <a href="${navEntry.url}">${navEntry.name}</a>&nbsp;&gt;&nbsp;
            </c:if>
            <c:if test="${status.last}">
                ${navEntry.name}
            </c:if>
        </c:forEach>
    </nav>
</div>
