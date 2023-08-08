package androidx.compose.p004ui.tooling.preview.datasource;

import androidx.compose.p004ui.tooling.preview.C16469e;
import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.tooling.preview.datasource.LoremIpsum */
public final class LoremIpsum implements C16469e<String> {

    /* renamed from: b */
    public static final int f40835b = 0;

    /* renamed from: a */
    public final int f40836a;

    public LoremIpsum(int i) {
        this.f40836a = i;
    }

    /* renamed from: b */
    public final String mo47801b(int i) {
        return SequencesKt___SequencesKt.m44737e1(SequencesKt___SequencesKt.m44715Y2(SequencesKt__SequencesKt.m44596m(new LoremIpsum$generateLoremIpsum$1(new Ref.IntRef(), C16468b.f40839a.size())), i), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C11300l) null, 62, (Object) null);
    }

    @C12579k
    public C11559m<String> getValues() {
        return SequencesKt__SequencesKt.m44600q(mo47801b(this.f40836a));
    }

    public LoremIpsum() {
        this(500);
    }
}
