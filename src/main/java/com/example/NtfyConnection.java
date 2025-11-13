package com.example;

import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public interface NtfyConnection {

    CompletableFuture<Boolean> send(String message);

    void receive(Consumer<NtfyMessageDto> messageHandler);

    CompletableFuture<Boolean> sendFile(Path path);

}