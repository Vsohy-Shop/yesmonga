package com.appsflyer.internal;

import android.net.TrafficStats;
import android.support.annotation.NonNull;
import com.appsflyer.AFLogger;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.appsflyer.internal.m */
public final class C22004m {
    public static C22004m AFInAppEventType;
    Executor AFInAppEventParameterName;
    ScheduledExecutorService AFKeystoreWrapper;
    final ThreadFactory valueOf = new ThreadFactory() {
        public final Thread newThread(@NonNull final Runnable runnable) {
            return new Thread(new Runnable() {
                public final void run() {
                    TrafficStats.setThreadStatsTag("AppsFlyer".hashCode());
                    runnable.run();
                }
            });
        }
    };
    ScheduledExecutorService values;

    public final Executor AFKeystoreWrapper() {
        Executor executor = this.AFInAppEventParameterName;
        if (executor == null || ((executor instanceof ThreadPoolExecutor) && (((ThreadPoolExecutor) executor).isShutdown() || ((ThreadPoolExecutor) this.AFInAppEventParameterName).isTerminated() || ((ThreadPoolExecutor) this.AFInAppEventParameterName).isTerminating()))) {
            this.AFInAppEventParameterName = Executors.newFixedThreadPool(2, this.valueOf);
        }
        return this.AFInAppEventParameterName;
    }

    public final ScheduledThreadPoolExecutor values() {
        boolean z;
        ScheduledExecutorService scheduledExecutorService = this.values;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown() || this.values.isTerminated()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.values = Executors.newScheduledThreadPool(2, this.valueOf);
        }
        return (ScheduledThreadPoolExecutor) this.values;
    }

    public static void AFKeystoreWrapper(ExecutorService executorService) {
        try {
            AFLogger.AFInAppEventType("shut downing executor ...");
            executorService.shutdown();
            executorService.awaitTermination(10, TimeUnit.SECONDS);
            if (!executorService.isTerminated()) {
                AFLogger.AFInAppEventType("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            AFLogger.AFInAppEventType("InterruptedException!!!");
            if (!executorService.isTerminated()) {
                AFLogger.AFInAppEventType("killing non-finished tasks");
            }
            executorService.shutdownNow();
        } catch (Throwable th) {
            if (!executorService.isTerminated()) {
                AFLogger.AFInAppEventType("killing non-finished tasks");
            }
            executorService.shutdownNow();
            throw th;
        }
    }
}
