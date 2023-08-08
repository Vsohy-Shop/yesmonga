package com.appsflyer.internal;

import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;

/* renamed from: com.appsflyer.internal.bg */
public final class C21921bg<ResponseBody> {
    final C21927bl AFInAppEventParameterName;
    public final ExecutorService AFInAppEventType;
    final C21846ab AFKeystoreWrapper;
    public final AtomicBoolean valueOf = new AtomicBoolean(false);
    final C21931bp<ResponseBody> values;

    public C21921bg(C21846ab abVar, ExecutorService executorService, C21927bl blVar, C21931bp<ResponseBody> bpVar) {
        this.AFKeystoreWrapper = abVar;
        this.AFInAppEventType = executorService;
        this.AFInAppEventParameterName = blVar;
        this.values = bpVar;
    }

    public final C21932bq<ResponseBody> values() throws IOException {
        if (!this.valueOf.getAndSet(true)) {
            C21932bq<String> valueOf2 = this.AFInAppEventParameterName.valueOf(this.AFKeystoreWrapper);
            try {
                return new C21932bq(this.values.AFInAppEventParameterName((String) valueOf2.values), valueOf2.AFInAppEventType, valueOf2.valueOf, valueOf2.AFKeystoreWrapper, valueOf2.AFInAppEventParameterName);
            } catch (JSONException e) {
                throw new ParsingException(e.getMessage(), e, valueOf2);
            }
        } else {
            throw new IllegalStateException("Http call is already executed");
        }
    }
}
