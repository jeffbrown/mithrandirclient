package mithrandirclient;

import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class TestClient {

    @Inject
    @Client("http://localhost:8086")
    RxHttpClient httpClient;

    public Flowable<String> getRandomName(){

        System.out.println("getRandomName invoked => " + httpClient);

        return Flowable.just("Some Random Name");
    }
}