package androidx.compose.foundation.text;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import androidx.compose.p004ui.input.key.C15439d;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDeadKeyCombiner.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeadKeyCombiner.android.kt\nandroidx/compose/foundation/text/DeadKeyCombiner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/* renamed from: androidx.compose.foundation.text.a */
public final class C2758a {
    @C12580l

    /* renamed from: a */
    public Integer f7259a;

    @C12580l
    /* renamed from: a */
    public final Integer mo9499a(@C12579k KeyEvent keyEvent) {
        boolean z;
        Intrinsics.checkNotNullParameter(keyEvent, "event");
        int c = C15439d.m68275c(keyEvent);
        Integer num = null;
        if ((Integer.MIN_VALUE & c) != 0) {
            this.f7259a = Integer.valueOf(c & Integer.MAX_VALUE);
            return null;
        }
        Integer num2 = this.f7259a;
        if (num2 == null) {
            return Integer.valueOf(c);
        }
        this.f7259a = null;
        Integer valueOf = Integer.valueOf(KeyCharacterMap.getDeadChar(num2.intValue(), c));
        if (valueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            num = valueOf;
        }
        if (num == null) {
            return Integer.valueOf(c);
        }
        return num;
    }
}
