package br.ufrpe.uag

class Professor {
	
	String cpf
	String nomeProfessor
	String sexo
	
	static hasMany = [disciplinas : Disciplina, alunos : Aluno, estatisticas : Estatistica]
	

    static constraints = {
		cpf blank: false, nullable: false, unique:true
		nomeProfessor blank: false, nullable: false
		sexo blank: true, nullable: true
    }
	
	static mapping = { id generator: 'increment' }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
		result = prime * result
				+ ((nomeProfessor == null) ? 0 : nomeProfessor.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (cpf == null) {
			if (other.cpf != null)
				return false;
		} else if (!cpf.equals(other.cpf))
			return false;
		if (nomeProfessor == null) {
			if (other.nomeProfessor != null)
				return false;
		} else if (!nomeProfessor.equals(other.nomeProfessor))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Professor [cpf=" + cpf + ", nomeProfessor=" + nomeProfessor + ", sexo=" + sexo + "]";
	}
}
