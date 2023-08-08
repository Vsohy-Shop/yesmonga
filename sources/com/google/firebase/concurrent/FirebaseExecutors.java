package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

public class FirebaseExecutors {

    public enum DirectExecutor implements Executor {
        INSTANCE;

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m131793a() {
        return DirectExecutor.INSTANCE;
    }

    /* renamed from: b */
    public static Executor m131794b(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
