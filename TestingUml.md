```plantuml
@startuml
class iPhone {
	-numero: String
	
	+ ReprodutorMusical: interface
		- tocar(musica: String): void
		- pausar(musisca: String): void
		- selecionarMusica(musica: String): void
	
	+ AparelhoTelefonico: interface
		- ligar(numero: String): void
		- atender(numero: String): void
		- iniciarCorreioVoz(): void
		
	+ NavegadorInternet: interface
		- exibirPagina(url: String): void
		- adicionarNovaAba(): void
		- atualizarPagina(url: String): void
} 
@enduml