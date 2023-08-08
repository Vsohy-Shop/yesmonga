package com.google.firebase.heartbeatinfo;

import androidx.annotation.C0359n0;

public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        
        private final int code;

        /* access modifiers changed from: public */
        HeartBeat(int i) {
            this.code = i;
        }

        /* renamed from: g */
        public int mo95734g() {
            return this.code;
        }
    }

    @C0359n0
    /* renamed from: b */
    HeartBeat mo95733b(@C0359n0 String str);
}
