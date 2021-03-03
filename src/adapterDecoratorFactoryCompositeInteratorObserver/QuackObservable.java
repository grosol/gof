package adapterDecoratorFactoryCompositeInteratorObserver;

public interface QuackObservable {
	void registerObserver(Observer observer);
	void notifyObservers();
}
