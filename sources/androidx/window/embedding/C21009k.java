package androidx.window.embedding;

import androidx.window.core.C20994d;
import androidx.window.embedding.C21011l;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C20994d
/* renamed from: androidx.window.embedding.k */
public final class C21009k implements C21011l {
    @C12579k

    /* renamed from: c */
    public static final C21010a f54183c = new C21010a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final boolean f54184d = true;
    @C12579k

    /* renamed from: e */
    public static final String f54185e = "EmbeddingCompat";
    @C12579k

    /* renamed from: a */
    public final ActivityEmbeddingComponent f54186a;
    @C12579k

    /* renamed from: b */
    public final C21007i f54187b;

    /* renamed from: androidx.window.embedding.k$a */
    public static final class C21010a {
        public /* synthetic */ C21010a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        /* renamed from: a */
        public final ActivityEmbeddingComponent mo62829a() {
            if (!mo62831c()) {
                return new C21015o();
            }
            ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
            if (activityEmbeddingComponent == null) {
                return new C21015o();
            }
            return activityEmbeddingComponent;
        }

        @C12580l
        /* renamed from: b */
        public final Integer mo62830b() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        /* renamed from: c */
        public final boolean mo62831c() {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return false;
            }
        }

        public C21010a() {
        }
    }

    public C21009k(@C12579k ActivityEmbeddingComponent activityEmbeddingComponent, @C12579k C21007i iVar) {
        Intrinsics.checkNotNullParameter(activityEmbeddingComponent, "embeddingExtension");
        Intrinsics.checkNotNullParameter(iVar, "adapter");
        this.f54186a = activityEmbeddingComponent;
        this.f54187b = iVar;
    }

    /* renamed from: a */
    public void mo62827a(@C12579k Set<? extends C21013m> set) {
        Intrinsics.checkNotNullParameter(set, "rules");
        this.f54186a.setEmbeddingRules(this.f54187b.mo62814j(set));
    }

    /* renamed from: b */
    public void mo62828b(@C12579k C21011l.C21012a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "embeddingCallback");
        this.f54186a.setSplitInfoCallback(new C21014n(aVar, this.f54187b));
    }

    public C21009k() {
        this(f54183c.mo62829a(), new C21007i());
    }
}
