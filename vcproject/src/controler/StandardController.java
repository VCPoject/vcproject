package controler;

import clientServer.ClientConsole;

public class StandardController {
	
	private ClientConsole clientConsole;
	private String host;
	private int port;
	private final int DEFAULT_PORT = 5555;
	
	public StandardController(String host, int port) {
		this.setPort(port);
		this.setHost(host);
	}
	
	public StandardController(String host) {
		this.setPort(DEFAULT_PORT);
		this.setHost(host);
	}
	
	public StandardController() {
		this.setPort(DEFAULT_PORT);
		setHost("localhost");
	}

	
	
	public void openConnection(){
		this.setClientConsole(new ClientConsole(this.host, DEFAULT_PORT));
	}
	
	public void sentToServer(Object[] msg){
		getClientConsole().accept(msg);
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public ClientConsole getClientConsole() {
		return clientConsole;
	}

	public void setClientConsole(ClientConsole clientConsole) {
		this.clientConsole = clientConsole;
	}
}
