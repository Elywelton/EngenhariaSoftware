<%@ page import="br.ufrpe.uag.Professor" %>



<div class="fieldcontain ${hasErrors(bean: professorInstance, field: 'cpf', 'error')} required">
	<label for="cpf">
		<g:message code="professor.cpf.label" default="Cpf" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cpf" required="" value="${professorInstance?.cpf}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: professorInstance, field: 'nomeProfessor', 'error')} required">
	<label for="nomeProfessor">
		<g:message code="professor.nomeProfessor.label" default="Nome Professor" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nomeProfessor" required="" value="${professorInstance?.nomeProfessor}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: professorInstance, field: 'sexo', 'error')} ">
	<label for="sexo">
		<g:message code="professor.sexo.label" default="Sexo" />
		
	</label>
	<g:textField name="sexo" value="${professorInstance?.sexo}"/>

</div>

