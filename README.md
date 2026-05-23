# OrganizaTrabalhos
# Sistema de Gerenciamento de Trabalhos 

Um sistema completo desenvolvido para solucionar o problema de organização de prazos acadêmicos e profissionais. A aplicação permite que estudantes ou profissionais controlem seus fluxos de entrega de trabalhos, organizem suas rotinas por disciplinas com cores customizadas, acompanhem o status de finalização e registrem notas obtidas.

## 🎯 Objetivos do Projeto
- Implementar um sistema seguro de autenticação de usuários.
- Permitir a criação de tarefas vinculadas a disciplinas específicas.
- Fornecer alertas visuais para trabalhos próximos do vencimento.
- Criar relatórios simples de desempenho com base nas notas inseridas após a conclusão.

## 🗄️ Arquitetura do Banco de Dados
O projeto utiliza um banco de dados relacional baseado no seguinte planejamento de entidades e relacionamentos.

### 📊 Modelo Entidade-Relacionamento (MER)
Aqui está o diagrama estrutural mapeado para o sistema:
<img width="801" height="291" alt="OrganizaTrabalhos" src="https://github.com/user-attachments/assets/12ef5d5e-f854-4b4a-88c3-a8ac5c666f96" />




### 👥 Regras de Negócio & Cardinalidade
- **Usuários (USER) ➔ Trabalhos (TRABALHO):** Relação de **1 para N**. Um usuário pode gerenciar múltiplos trabalhos, mas cada trabalho está estritamente vinculado ao seu criador, garantindo a privacidade dos dados.
- **Disciplinas (DISCIPLINA) ➔ Trabalhos (TRABALHO):** Relação de **1 para N**. Uma disciplina pode conter várias tarefas associadas, permitindo a filtragem dinâmica no sistema. Cada trabalho pertence a uma única disciplina.
