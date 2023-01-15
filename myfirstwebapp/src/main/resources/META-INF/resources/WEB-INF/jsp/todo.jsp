<%--
  Created by IntelliJ IDEA.
  User: tsebok
  Date: 12/27/2022
  Time: 4:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<div class="container">
    <h1> Enter Todo Details</h1>
    <form:form method="post" modelAttribute="todo">
        <fieldset class="mb-3">
            <form:label path="description">Description</form:label>
            <form:input type="text" name="description" required="required" path="description"/>
            <form:errors path="description" cssClass="text-warning"/>
        </fieldset>
        <fieldset class="mb-3">
            <form:label path="targetDate">Target Date</form:label>
            <form:input type="text" name="description" required="required" path="targetDate"/>
            <form:errors path="targetDate" cssClass="text-warning"/>
        </fieldset>
        <form:input type="hidden" path="id"/>
        <form:input type="hidden" path="done"/>
        <input type="submit" class="btn btn-success">
    </form:form>
</div>

<%@ include file="common/footer.jspf" %>
<script type="text/javascript">
    $('#targetDate').datepicker({
        format: 'yyyy-mm-dd'
    });
</script>

