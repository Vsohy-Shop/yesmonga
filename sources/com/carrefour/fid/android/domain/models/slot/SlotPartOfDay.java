package com.carrefour.fid.android.domain.models.slot;

import kotlin.C11076d0;

@C11076d0(mo22515d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/slot/SlotPartOfDay;", "", "", "hour", "I", "q", "()I", "<init>", "(Ljava/lang/String;II)V", "a", "b", "c", "domain-shared_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public enum SlotPartOfDay {
    AFTERNOON(12),
    EVENING(18),
    MORNING(0);
    
    private final int hour;

    /* access modifiers changed from: public */
    SlotPartOfDay(int i) {
        this.hour = i;
    }

    /* renamed from: q */
    public final int mo119548q() {
        return this.hour;
    }
}
