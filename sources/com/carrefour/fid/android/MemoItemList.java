package com.carrefour.fid.android;

import com.carrefour.fid.android.MemoItem;
import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34471v0;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

public final class MemoItemList extends GeneratedMessageLite<MemoItemList, C13126b> implements C13977e0 {
    /* access modifiers changed from: private */
    public static final MemoItemList DEFAULT_INSTANCE;
    public static final int ITEMS_FIELD_NUMBER = 1;
    private static volatile C34504y1<MemoItemList> PARSER;
    private C34471v0.C34488k<MemoItem> items_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.carrefour.fid.android.MemoItemList$a */
    public static /* synthetic */ class C13125a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f32243a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke[] r0 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32243a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32243a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32243a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32243a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32243a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f32243a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f32243a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.MemoItemList.C13125a.<clinit>():void");
        }
    }

    /* renamed from: com.carrefour.fid.android.MemoItemList$b */
    public static final class C13126b extends GeneratedMessageLite.C34263b<MemoItemList, C13126b> implements C13977e0 {
        /* renamed from: P */
        public C13126b mo30833P(Iterable<? extends MemoItem> iterable) {
            mo100457F();
            ((MemoItemList) this.f83053b).addAllItems(iterable);
            return this;
        }

        /* renamed from: R */
        public C13126b mo30834R(int i, MemoItem.C13124b bVar) {
            mo100457F();
            ((MemoItemList) this.f83053b).addItems(i, (MemoItem) bVar.mo100473g());
            return this;
        }

        /* renamed from: S */
        public C13126b mo30835S(int i, MemoItem memoItem) {
            mo100457F();
            ((MemoItemList) this.f83053b).addItems(i, memoItem);
            return this;
        }

        /* renamed from: T */
        public C13126b mo30836T(MemoItem.C13124b bVar) {
            mo100457F();
            ((MemoItemList) this.f83053b).addItems((MemoItem) bVar.mo100473g());
            return this;
        }

        /* renamed from: U */
        public C13126b mo30837U(MemoItem memoItem) {
            mo100457F();
            ((MemoItemList) this.f83053b).addItems(memoItem);
            return this;
        }

        /* renamed from: V */
        public C13126b mo30838V() {
            mo100457F();
            ((MemoItemList) this.f83053b).clearItems();
            return this;
        }

        /* renamed from: Y */
        public C13126b mo30839Y(int i) {
            mo100457F();
            ((MemoItemList) this.f83053b).removeItems(i);
            return this;
        }

        /* renamed from: Z */
        public C13126b mo30840Z(int i, MemoItem.C13124b bVar) {
            mo100457F();
            ((MemoItemList) this.f83053b).setItems(i, (MemoItem) bVar.mo100473g());
            return this;
        }

        /* renamed from: a0 */
        public C13126b mo30841a0(int i, MemoItem memoItem) {
            mo100457F();
            ((MemoItemList) this.f83053b).setItems(i, memoItem);
            return this;
        }

        public MemoItem getItems(int i) {
            return ((MemoItemList) this.f83053b).getItems(i);
        }

        public int getItemsCount() {
            return ((MemoItemList) this.f83053b).getItemsCount();
        }

        public List<MemoItem> getItemsList() {
            return Collections.unmodifiableList(((MemoItemList) this.f83053b).getItemsList());
        }

        public C13126b() {
            super(MemoItemList.DEFAULT_INSTANCE);
        }
    }

    static {
        MemoItemList memoItemList = new MemoItemList();
        DEFAULT_INSTANCE = memoItemList;
        GeneratedMessageLite.registerDefaultInstance(MemoItemList.class, memoItemList);
    }

    private MemoItemList() {
    }

    /* access modifiers changed from: private */
    public void addAllItems(Iterable<? extends MemoItem> iterable) {
        ensureItemsIsMutable();
        C34319a.addAll(iterable, this.items_);
    }

    /* access modifiers changed from: private */
    public void addItems(MemoItem memoItem) {
        memoItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(memoItem);
    }

    /* access modifiers changed from: private */
    public void clearItems() {
        this.items_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureItemsIsMutable() {
        C34471v0.C34488k<MemoItem> kVar = this.items_;
        if (!kVar.mo100971T()) {
            this.items_ = GeneratedMessageLite.mutableCopy(kVar);
        }
    }

    public static MemoItemList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C13126b newBuilder() {
        return (C13126b) DEFAULT_INSTANCE.createBuilder();
    }

    public static MemoItemList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (MemoItemList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MemoItemList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (MemoItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<MemoItemList> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void removeItems(int i) {
        ensureItemsIsMutable();
        this.items_.remove(i);
    }

    /* access modifiers changed from: private */
    public void setItems(int i, MemoItem memoItem) {
        memoItem.getClass();
        ensureItemsIsMutable();
        this.items_.set(i, memoItem);
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C13125a.f32243a[methodToInvoke.ordinal()]) {
            case 1:
                return new MemoItemList();
            case 2:
                return new C13126b();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"items_", MemoItem.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<MemoItemList> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (MemoItemList.class) {
                        y1Var = PARSER;
                        if (y1Var == null) {
                            y1Var = new GeneratedMessageLite.C34264c<>(DEFAULT_INSTANCE);
                            PARSER = y1Var;
                        }
                    }
                }
                return y1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public MemoItem getItems(int i) {
        return this.items_.get(i);
    }

    public int getItemsCount() {
        return this.items_.size();
    }

    public List<MemoItem> getItemsList() {
        return this.items_;
    }

    public C13979f0 getItemsOrBuilder(int i) {
        return this.items_.get(i);
    }

    public List<? extends C13979f0> getItemsOrBuilderList() {
        return this.items_;
    }

    public static C13126b newBuilder(MemoItemList memoItemList) {
        return (C13126b) DEFAULT_INSTANCE.createBuilder(memoItemList);
    }

    public static MemoItemList parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (MemoItemList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static MemoItemList parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (MemoItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static MemoItemList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (MemoItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    /* access modifiers changed from: private */
    public void addItems(int i, MemoItem memoItem) {
        memoItem.getClass();
        ensureItemsIsMutable();
        this.items_.add(i, memoItem);
    }

    public static MemoItemList parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (MemoItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static MemoItemList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (MemoItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MemoItemList parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (MemoItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static MemoItemList parseFrom(InputStream inputStream) throws IOException {
        return (MemoItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MemoItemList parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (MemoItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static MemoItemList parseFrom(C34448s sVar) throws IOException {
        return (MemoItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static MemoItemList parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (MemoItemList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
