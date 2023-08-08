package com.usabilla.sdk.ubform;

import androidx.annotation.Keep;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

public final class Logger {
    @C12579k

    /* renamed from: a */
    public static final Companion f26647a = new Companion((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static boolean f26648b = false;
    @C12579k

    /* renamed from: c */
    public static final String f26649c = "UBError";
    @C12579k

    /* renamed from: d */
    public static final String f26650d = "UBInfo";

    @Keep
    @C11076d0(mo22515d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/Logger$Companion;", "", "", "errorMessage", "Lkotlin/d2;", "logError", "infoMessage", "logInfo", "", "isDebugEnabled", "Z", "()Z", "setDebugEnabled", "(Z)V", "tagError", "Ljava/lang/String;", "tagInfo", "<init>", "()V", "ubform_sdkRelease"}, mo22517k = 1, mo22518mv = {1, 5, 1})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isDebugEnabled() {
            return Logger.f26648b;
        }

        public final void logError(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, C9874a.f27073r);
            isDebugEnabled();
        }

        public final void logInfo(@C12579k String str) {
            Intrinsics.checkNotNullParameter(str, "infoMessage");
            isDebugEnabled();
        }

        public final void setDebugEnabled(boolean z) {
            Logger.f26648b = z;
        }

        private Companion() {
        }
    }
}
