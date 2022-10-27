package reactor;

import reactor.core.publisher.Flux;

public class MainApp {

	public static void main(String[] args) {
		
		Flux<String> envioMsg = Flux.just("Msg1","Msg2","Msg3");
		
		envioMsg.subscribe(t -> System.out.println("Observer 1, Suscribed"),
				m -> System.out.println("Observer 1, received: "+ m),
				e -> System.out.println("Observer 1, Error")
				);

	}

}
