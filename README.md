# Troca BEM

Um aplicativo Android moderno para troca de itens entre usuários, desenvolvido em Kotlin com design inspirado nas melhores práticas de UX/UI.

## 🚀 Sobre o Projeto

TrocaBEM é uma plataforma que conecta pessoas interessadas em trocar objetos, promovendo sustentabilidade e economia colaborativa. O app permite que usuários cadastrem itens, encontrem outros interessados em trocas e se conectem de forma segura.

## 📱 Screenshots

| Tela de Login | Lista de Itens |
|---------------|----------------|
| ![Login](screenshots/login.png) | ![Items](screenshots/items.png) |

## ✨ Funcionalidades

### 🔐 Autenticação
- [ ] Login com Apple ID
- [ ] Login com Facebook
- [ ] Login com número de telefone
- [ ] Recuperação de conta

### 📦 Gerenciamento de Itens
- [x] Visualização de itens disponíveis
- [x] Cards informativos com foto, nome do usuário e localização
- [ ] Cadastro de novos itens
- [ ] Edição de itens próprios
- [ ] Sistema de favoritos

### 🗺️ Localização
- [x] Exibição de distância entre usuários
- [ ] Filtros por proximidade
- [ ] Mapa interativo

### 💬 Comunicação
- [ ] Sistema de mensagens
- [ ] Notificações push
- [ ] Histórico de conversas

### ⭐ Avaliações
- [ ] Sistema de avaliação de usuários
- [ ] Histórico de trocas
- [ ] Reputação baseada em feedback

## 🛠️ Tecnologias Utilizadas

### Core
- **Kotlin** - Linguagem principal
- **Android SDK** (API 24+)
- **View Binding** - Binding de views type-safe

### UI/UX
- **Material Design** - Componentes visuais
- **RecyclerView** - Listas otimizadas
- **CardView** - Layout de cards
- **Gradient Backgrounds** - Design moderno

### Arquitetura
- **MVVM Pattern** - Separação de responsabilidades
- **ListAdapter** - Gerenciamento eficiente de listas
- **DiffUtil** - Otimização de atualizações

### Dependências Principais
```kotlin
implementation("androidx.core:core-ktx:1.12.0")
implementation("androidx.appcompat:appcompat:1.6.1")
implementation("com.google.android.material:material:1.11.0")
implementation("androidx.recyclerview:recyclerview:1.3.2")
implementation("androidx.cardview:cardview:1.0.0")
implementation("com.github.bumptech.glide:glide:4.16.0")
```

## 🏗️ Arquitetura do Projeto

```
app/
├── src/main/java/com/example/trocabem/
│   ├── MainActivity.kt                 # Tela de login
│   ├── ItemsListActivity.kt           # Lista de itens
│   ├── adapter/
│   │   └── ItemAdapter.kt             # Adapter do RecyclerView
│   └── model/
│       ├── Usuario.kt                 # Modelo de usuário
│       └── Item.kt                    # Modelo de item
├── src/main/res/
│   ├── layout/
│   │   ├── activity_main.xml          # Layout da tela de login
│   │   ├── activity_items_list.xml    # Layout da lista
│   │   └── item_card.xml              # Layout do card de item
│   ├── drawable/                      # Recursos visuais
│   └── values/                        # Cores, strings, estilos
└── AndroidManifest.xml
```

## 🚦 Como Executar

### Pré-requisitos
- Android Studio Arctic Fox ou superior
- JDK 8 ou superior
- SDK Android 24+ (Android 7.0)

### Passos
1. **Clone o repositório**
   ```bash
   git clone https://github.com/seu-usuario/trocabem.git
   cd trocabem
   ```

2. **Abra no Android Studio**
    - File → Open → Selecione a pasta do projeto

3. **Sincronize o Gradle**
   ```bash
   ./gradlew clean build
   ```

4. **Execute o app**
    - Conecte um device Android ou use o emulador
    - Clique em "Run" ou use `Shift + F10`

## 📋 Configuração do Ambiente

### Versões Recomendadas
- **Android Gradle Plugin:** 8.2.0
- **Kotlin:** 1.9.10
- **Gradle:** 8.2
- **Target SDK:** 34
- **Min SDK:** 24


## 🎨 Design System


### Tipografia
- **Headers:** Sans-serif Medium, 20-28sp
- **Body:** Sans-serif Regular, 14-16sp
- **Captions:** Sans-serif Regular, 12sp

## 🗂️ Estrutura de Dados (UML)

O projeto segue o diagrama UML fornecido com as seguintes entidades principais:

### Usuario
```kotlin
data class Usuario(
    val id: Int,
    val nome: String,
    val email: String,
    val telefone: String,
    val senha: String,
    val localizacao: String,
    val foto: String
)
```

### Item
```kotlin
data class Item(
    val id: Int,
    val nome: String,
    val descricao: String,
    val categoria: String,
    val fotos: List<String>,
    val estadoConservacao: String,
    val dataCadastro: Long,
    val disponivel: Boolean
)
```

## 🔮 Próximos Passos

### Fase 1 - Core Features
- [ ] Sistema de autenticação real
- [ ] Cadastro de usuários
- [ ] Upload de imagens
- [ ] Banco de dados local (Room)

### Fase 2 - Funcionalidades Avançadas
- [ ] API REST / Firebase
- [ ] Sistema de mensagens
- [ ] Notificações push
- [ ] Geolocalização

### Fase 3 - Otimizações
- [ ] Testes unitários e instrumentados
- [ ] CI/CD pipeline
- [ ] Monitoramento de performance
- [ ] Acessibilidade

## 🤝 Contribuindo

1. **Fork** o projeto
2. Crie uma **branch** para sua feature (`git checkout -b feature/AmazingFeature`)
3. **Commit** suas mudanças (`git commit -m 'Add some AmazingFeature'`)
4. **Push** para a branch (`git push origin feature/AmazingFeature`)
5. Abra um **Pull Request**

## 📝 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👥 Autores

- **Seu Nome** - *Desenvolvimento inicial* - [@seu-github](https://github.com/seu-usuario)

## 🙏 Agradecimentos

- Design inspirado nas melhores práticas de Material Design
- Comunidade Android/Kotlin por recursos e documentação
- Contribuidores e testadores

## 📞 Suporte

Se você encontrar algum problema ou tiver sugestões:

- 🐛 **Issues:** [GitHub Issues](https://github.com/seu-usuario/trocabem/issues)
- 💬 **Discussões:** [GitHub Discussions](https://github.com/seu-usuario/trocabem/discussions)
- 📧 **Email:** seu-email@exemplo.com

---

  <sub>Construído com ❤️ por <a href="https://github.com/geizii">Geiziane Silva</a>
</div>