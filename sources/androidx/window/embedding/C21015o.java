package androidx.window.embedding;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.window.embedding.o */
public final class C21015o implements ActivityEmbeddingComponent {
    /* renamed from: a */
    public void mo62835a(@C12579k Set<EmbeddingRule> set) {
        Intrinsics.checkNotNullParameter(set, "splitRules");
    }

    /* renamed from: b */
    public void mo62836b(@C12579k Consumer<List<SplitInfo>> consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
    }
}
