package com.carrefour.fid.android.core.type;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.core.type.a */
public abstract class C36368a {

    /* renamed from: b */
    public static final int f89964b = 0;
    @C12579k

    /* renamed from: a */
    public final String f89965a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.core.type.a$a */
    public static final class C36369a extends C36368a {
        @C12579k

        /* renamed from: c */
        public static final C36369a f89966c = new C36369a();

        /* renamed from: d */
        public static final int f89967d = 0;

        public C36369a() {
            super("checked", (DefaultConstructorMarker) null);
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.core.type.a$b */
    public static final class C36370b extends C36368a {
        @C12579k

        /* renamed from: c */
        public static final C36370b f89968c = new C36370b();

        /* renamed from: d */
        public static final int f89969d = 0;

        public C36370b() {
            super("unchecked", (DefaultConstructorMarker) null);
        }
    }

    public /* synthetic */ C36368a(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @C12579k
    /* renamed from: a */
    public final String mo108613a() {
        return this.f89965a;
    }

    public C36368a(String str) {
        this.f89965a = str;
    }
}
