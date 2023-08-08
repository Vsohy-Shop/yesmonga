package androidx.core.view;

import android.content.ClipData;
import androidx.core.util.C18007x;
import java.util.function.Predicate;

/* renamed from: androidx.core.view.j */
public final /* synthetic */ class C18266j implements C18007x {

    /* renamed from: a */
    public final /* synthetic */ Predicate f46900a;

    public /* synthetic */ C18266j(Predicate predicate) {
        this.f46900a = predicate;
    }

    public final boolean test(Object obj) {
        return this.f46900a.test((ClipData.Item) obj);
    }
}
