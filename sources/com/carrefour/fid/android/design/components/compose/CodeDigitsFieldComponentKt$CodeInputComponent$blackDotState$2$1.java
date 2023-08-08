package com.carrefour.fid.android.design.components.compose;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nCodeDigitsFieldComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeDigitsFieldComponent.kt\ncom/carrefour/fid/android/design/components/compose/CodeDigitsFieldComponentKt$CodeInputComponent$blackDotState$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,561:1\n1747#2,3:562\n*S KotlinDebug\n*F\n+ 1 CodeDigitsFieldComponent.kt\ncom/carrefour/fid/android/design/components/compose/CodeDigitsFieldComponentKt$CodeInputComponent$blackDotState$2$1\n*L\n125#1:562,3\n*E\n"})
public final class CodeDigitsFieldComponentKt$CodeInputComponent$blackDotState$2$1 extends Lambda implements C11289a<Character> {
    final /* synthetic */ SnapshotStateList<String> $digitList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CodeDigitsFieldComponentKt$CodeInputComponent$blackDotState$2$1(SnapshotStateList<String> snapshotStateList) {
        super(0);
        this.$digitList = snapshotStateList;
    }

    @C12579k
    /* renamed from: a */
    public final Character invoke() {
        char c;
        boolean z;
        SnapshotStateList<String> snapshotStateList = this.$digitList;
        boolean z2 = false;
        if (!(snapshotStateList instanceof Collection) || !snapshotStateList.isEmpty()) {
            Iterator<String> it = snapshotStateList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            c = C36964a.f92344b;
        } else {
            c = C36964a.f92345c;
        }
        return Character.valueOf(c);
    }
}
