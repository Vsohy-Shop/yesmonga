package com.bumptech.glide;

public enum MemoryCategory {
    LOW(0.5f),
    NORMAL(1.0f),
    HIGH(1.5f);
    
    private final float multiplier;

    /* access modifiers changed from: public */
    MemoryCategory(float f) {
        this.multiplier = f;
    }

    /* renamed from: g */
    public float mo65439g() {
        return this.multiplier;
    }
}
