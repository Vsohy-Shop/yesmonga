package com.usabilla.sdk.ubform.utils.ext;

import com.usabilla.sdk.ubform.net.http.C9870g;
import com.usabilla.sdk.ubform.net.http.C9872i;
import com.usabilla.sdk.ubform.net.http.C9873j;
import java.util.Map;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ExtensionFlowKt {

    /* renamed from: com.usabilla.sdk.ubform.utils.ext.ExtensionFlowKt$a */
    public static final class C10121a implements C9873j {
        @C12580l

        /* renamed from: a */
        public final Integer f27839a;
        @C12580l

        /* renamed from: b */
        public final Map<String, String> f27840b;
        @C12579k

        /* renamed from: c */
        public final String f27841c;
        @C12580l

        /* renamed from: d */
        public final String f27842d;

        /* renamed from: e */
        public final /* synthetic */ C9873j f27843e;

        /* renamed from: f */
        public final /* synthetic */ String f27844f;

        public C10121a(C9873j jVar, String str) {
            this.f27843e = jVar;
            this.f27844f = str;
            this.f27839a = jVar.mo20307a();
            this.f27840b = jVar.getHeaders();
            this.f27841c = str;
            this.f27842d = jVar.getError();
        }

        @C12580l
        /* renamed from: a */
        public Integer mo20307a() {
            return this.f27839a;
        }

        @C12579k
        public String getBody() {
            return this.f27841c;
        }

        @C12580l
        public String getError() {
            return this.f27842d;
        }

        @C12580l
        public Map<String, String> getHeaders() {
            return this.f27840b;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ C11907e m38301b(C9870g gVar, C9872i iVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(iVar, "request");
        return C11909g.m47376J0(new ExtensionFlowKt$executeRequest$1(gVar, iVar, (C11045c<? super ExtensionFlowKt$executeRequest$1>) null));
    }

    /* renamed from: c */
    public static final /* synthetic */ C11907e m38302c(C11907e eVar, C11300l lVar, C11300l lVar2) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "onSuccess");
        Intrinsics.checkNotNullParameter(lVar2, "onError");
        return C11909g.m47494u(new ExtensionFlowKt$serviceFlow$$inlined$map$1(eVar, lVar, lVar2), new ExtensionFlowKt$serviceFlow$$inlined$catchException$1((C11045c) null, lVar2));
    }
}
