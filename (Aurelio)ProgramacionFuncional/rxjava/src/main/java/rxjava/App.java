package rxjava;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.Observable;

public class App {

	public static void main(String[] args) {
		Observable<String> messageSender = Observable.just("msg1", "msg2", "msg3");
		
		messageSender.subscribe(new Observer() {

			public void onSubscribe(Disposable d) {
				System.out.println("Observer1, Subscribed.");
				
			}

			public void onNext(Object t) {
				System.out.println("Observer1, Recived." + t);
			}

			public void onError(Throwable e) {
				System.out.println("Observer1, Error."+e.getMessage());
				
			}

			public void onComplete() {
				System.out.println("Observer1, Complete.");
				
			}});

		messageSender.subscribe(new Observer() {

			public void onSubscribe(Disposable d) {
				System.out.println("Observer2, Subscribed.");
				
			}

			public void onNext(Object t) {
				System.out.println("Observer2, Recived." + t);
			}

			public void onError(Throwable e) {
				System.out.println("Observer2, Error."+e.getMessage());
				
			}

			public void onComplete() {
				System.out.println("Observer2, Complete.");
				
			}});
	}

}
