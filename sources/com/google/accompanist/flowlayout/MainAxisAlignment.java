package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.Arrangement;
import kotlin.C11076d0;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, mo22516d2 = {"Lcom/google/accompanist/flowlayout/MainAxisAlignment;", "", "Landroidx/compose/foundation/layout/Arrangement$l;", "arrangement", "Landroidx/compose/foundation/layout/Arrangement$l;", "q", "()Landroidx/compose/foundation/layout/Arrangement$l;", "<init>", "(Ljava/lang/String;ILandroidx/compose/foundation/layout/Arrangement$l;)V", "a", "b", "c", "d", "e", "f", "flowlayout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum MainAxisAlignment {
    Center(r1.mo7625f()),
    Start(r1.mo7631r()),
    End(r1.mo7624d()),
    SpaceEvenly(r1.mo7629n()),
    SpaceBetween(r1.mo7628l()),
    SpaceAround(r1.mo7627j());
    
    @C12579k
    private final Arrangement.C2279l arrangement;

    /* access modifiers changed from: public */
    MainAxisAlignment(Arrangement.C2279l lVar) {
        this.arrangement = lVar;
    }

    @C12579k
    /* renamed from: q */
    public final Arrangement.C2279l mo41963q() {
        return this.arrangement;
    }
}
