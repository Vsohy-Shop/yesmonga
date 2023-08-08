package androidx.window.layout;

import com.carrefour.fid.android.core.constants.C36187r;
import kotlin.jvm.C11287e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.window.layout.l */
public interface C21052l extends C21045g {

    /* renamed from: androidx.window.layout.l$a */
    public static final class C21053a {
        @C12579k

        /* renamed from: b */
        public static final C21054a f54285b = new C21054a((DefaultConstructorMarker) null);
        @C12579k
        @C11287e

        /* renamed from: c */
        public static final C21053a f54286c = new C21053a("NONE");
        @C12579k
        @C11287e

        /* renamed from: d */
        public static final C21053a f54287d = new C21053a(C36187r.f89351b);
        @C12579k

        /* renamed from: a */
        public final String f54288a;

        /* renamed from: androidx.window.layout.l$a$a */
        public static final class C21054a {
            public /* synthetic */ C21054a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C21054a() {
            }
        }

        public C21053a(String str) {
            this.f54288a = str;
        }

        @C12579k
        public String toString() {
            return this.f54288a;
        }
    }

    /* renamed from: androidx.window.layout.l$b */
    public static final class C21055b {
        @C12579k

        /* renamed from: b */
        public static final C21056a f54289b = new C21056a((DefaultConstructorMarker) null);
        @C12579k
        @C11287e

        /* renamed from: c */
        public static final C21055b f54290c = new C21055b("VERTICAL");
        @C12579k
        @C11287e

        /* renamed from: d */
        public static final C21055b f54291d = new C21055b("HORIZONTAL");
        @C12579k

        /* renamed from: a */
        public final String f54292a;

        /* renamed from: androidx.window.layout.l$b$a */
        public static final class C21056a {
            public /* synthetic */ C21056a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C21056a() {
            }
        }

        public C21055b(String str) {
            this.f54292a = str;
        }

        @C12579k
        public String toString() {
            return this.f54292a;
        }
    }

    /* renamed from: androidx.window.layout.l$c */
    public static final class C21057c {
        @C12579k

        /* renamed from: b */
        public static final C21058a f54293b = new C21058a((DefaultConstructorMarker) null);
        @C12579k
        @C11287e

        /* renamed from: c */
        public static final C21057c f54294c = new C21057c("FLAT");
        @C12579k
        @C11287e

        /* renamed from: d */
        public static final C21057c f54295d = new C21057c("HALF_OPENED");
        @C12579k

        /* renamed from: a */
        public final String f54296a;

        /* renamed from: androidx.window.layout.l$c$a */
        public static final class C21058a {
            public /* synthetic */ C21058a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public C21058a() {
            }
        }

        public C21057c(String str) {
            this.f54296a = str;
        }

        @C12579k
        public String toString() {
            return this.f54296a;
        }
    }

    @C12579k
    /* renamed from: a */
    C21055b mo62982a();

    /* renamed from: b */
    boolean mo62983b();

    @C12579k
    /* renamed from: c */
    C21053a mo62984c();

    @C12579k
    C21057c getState();
}
