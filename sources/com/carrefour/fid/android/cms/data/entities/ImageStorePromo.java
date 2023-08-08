package com.carrefour.fid.android.cms.data.entities;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/cms/data/entities/ImageStorePromo;", "", "()V", "alt", "", "getAlt", "()Ljava/lang/String;", "setAlt", "(Ljava/lang/String;)V", "uri", "getUri", "setUri", "url", "getUrl", "setUrl", "cms_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
public final class ImageStorePromo {
    @C33608c("alt")
    @C12579k
    private String alt = "";
    @C33608c("uri")
    @C12579k
    private String uri = "";
    @C33608c("url")
    @C12579k
    private String url = "";

    @C12579k
    public final String getAlt() {
        return this.alt;
    }

    @C12579k
    public final String getUri() {
        return this.uri;
    }

    @C12579k
    public final String getUrl() {
        return this.url;
    }

    public final void setAlt(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.alt = str;
    }

    public final void setUri(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uri = str;
    }

    public final void setUrl(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }
}
