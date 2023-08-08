package androidx.profileinstaller;

enum FileSectionType {
    DEX_FILES(0),
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    AGGREGATION_COUNT(4);
    
    private final long mValue;

    /* access modifiers changed from: public */
    FileSectionType(long j) {
        this.mValue = j;
    }

    /* renamed from: q */
    public static FileSectionType m92934q(long j) {
        FileSectionType[] values = values();
        for (int i = 0; i < values.length; i++) {
            if (values[i].mo59253r() == j) {
                return values[i];
            }
        }
        throw new IllegalArgumentException("Unsupported FileSection Type " + j);
    }

    /* renamed from: r */
    public long mo59253r() {
        return this.mValue;
    }
}
