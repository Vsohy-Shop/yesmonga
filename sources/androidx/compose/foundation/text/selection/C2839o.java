package androidx.compose.foundation.text.selection;

import java.util.Comparator;
import kotlin.jvm.functions.C11304p;

/* renamed from: androidx.compose.foundation.text.selection.o */
public final /* synthetic */ class C2839o implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ C11304p f7465a;

    public /* synthetic */ C2839o(C11304p pVar) {
        this.f7465a = pVar;
    }

    public final int compare(Object obj, Object obj2) {
        return SelectionRegistrarImpl.m12820F(this.f7465a, obj, obj2);
    }
}
