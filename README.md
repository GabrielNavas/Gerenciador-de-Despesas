## O que tem dentro?

```
src/main/java/com/despesas/
├── Application.java          ← Classe que inicia tudo
├── entity/
│   └── Despesa.java          ← Modelo da despesa (id, valor, data...)
├── repository/
│   └── DespesaRepository.java ← Acessa o banco de dados
└── controller/
    └── DespesaController.java ← Recebe requisições HTTP

src/main/resources/
├── application.properties     ← Configurações (porta, banco...)
├── templates/despesas/
│   └── lista.html             ← Página que você vê no navegador
└── static/css/
    └── style.css              
```

## Stack Tecnológico

- **Java 17** 
- **Spring Boot 3** 
- **Spring Data JPA** 
- **H2 Database** (em memória)
- **Thymeleaf** (Template HTML)
- **Maven** (Gerenciador de dependências)
- **Lombok** (Reduz boilerplate)

## Funcionalidades

 **Listar** todas as despesas  
 **Criar** nova despesa com validação  
 **Deletar** despesa  
 **Soma Total** de despesas  
 **Categorias** predefinidas  
 **Validação** de dados (valor > 0)

##  Como Usar (Rápido)

### 1. Instalar o necessário
- Baixe e instale **Java 17+**: https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html
- Baixe e instale **Maven**: https://maven.apache.org/download.cgi

### 2. Rodar o projeto
```bash
cd "Gerenciador de gastos"
mvn spring-boot:run
```

### 3. Abrir no navegador
```
http://localhost:8081/despesas
```


## O que cada arquivo faz?

### **Despesa.java** (Modelo)
Define como uma despesa é armazenada:
- `descricao` - O que você gastou
- `valor` - Quanto custou
- `data` - Quando foi
- `categoria` - Tipo (Alimentação, Transporte, etc)

### **DespesaRepository.java** (Banco de dados)
Métodos prontos para:
- Salvar despesa no banco
- Buscar todas as despesas
- Deletar uma despesa
- Calcular o total de gastos

### **DespesaController.java** (Lógica)
Quando você acessa o site:
- `GET /despesas` - Mostra a página com todas as despesas
- `POST /despesas` - Salva uma nova despesa
- `POST /despesas/{id}/deletar` - Deleta uma despesa

### **lista.html** (Visual)
A página que você vê no navegador com:
- Formulário para adicionar despesas
- Tabela com todas as despesas
- Total de gastos no topo

---

## O que você pode fazer?

 Adicionar uma despesa (descrição, valor, data, categoria)  
 Ver todas as despesas em uma tabela  
 Ver o **total gasto** automaticamente calculado  
 Deletar uma despesa  
 Refrescar a página - os dados continuam lá!

---

## Se der erro...

**Erro: "Porta 8081 já está em uso"**
- Mude a porta em: `src/main/resources/application.properties`
- Troque `server.port=8081` por outra (tipo 8082, 8083...)

**Erro: "Conexão recusada"**
- Verifique se o Maven terminou de carregar
- Espere aparecer `Tomcat started on port 8081`
- Então acesse `http://localhost:8081/despesas`

**Tudo quebrou?**
```bash
mvn clean spring-boot:run
```

---
