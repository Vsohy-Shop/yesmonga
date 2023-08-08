package com.appsflyer.internal;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/* renamed from: com.appsflyer.internal.ct */
public abstract class C21967ct extends Observable {
    public final String AFInAppEventParameterName;
    public final Map<String, Object> AFInAppEventType = new HashMap();
    private long AFKeystoreWrapper;
    final Runnable valueOf;
    public C21969c values = C21969c.NOT_STARTED;

    /* renamed from: com.appsflyer.internal.ct$c */
    public enum C21969c {
        NOT_STARTED,
        STARTED,
        FINISHED
    }

    public C21967ct(String str, Runnable runnable) {
        this.valueOf = runnable;
        this.AFInAppEventParameterName = str;
    }

    public abstract void AFInAppEventParameterName(Context context);

    public final void AFInAppEventType() {
        this.AFInAppEventType.put("source", this.AFInAppEventParameterName);
        this.AFInAppEventType.putAll(new C21964cr());
        this.AFInAppEventType.put("latency", Long.valueOf(System.currentTimeMillis() - this.AFKeystoreWrapper));
        this.values = C21969c.FINISHED;
        setChanged();
        notifyObservers();
    }

    public final void valueOf() {
        this.AFKeystoreWrapper = System.currentTimeMillis();
        this.values = C21969c.STARTED;
        addObserver(new Observer() {
            public final void update(Observable observable, Object obj) {
                C21967ct.this.valueOf.run();
            }
        });
    }
}
