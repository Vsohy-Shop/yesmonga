package androidx.compose.p004ui.tooling.preview;

import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.tooling.preview.e */
public interface C16469e<T> {

    /* renamed from: androidx.compose.ui.tooling.preview.e$a */
    public static final class C16470a {
        @Deprecated
        /* renamed from: a */
        public static <T> int m74344a(@C12579k C16469e<T> eVar) {
            return C16469e.super.getCount();
        }
    }

    int getCount() {
        return SequencesKt___SequencesKt.m44744g0(getValues());
    }

    @C12579k
    C11559m<T> getValues();
}
