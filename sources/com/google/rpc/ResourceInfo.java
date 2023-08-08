package com.google.rpc;

import com.google.protobuf.ByteString;
import com.google.protobuf.C34319a;
import com.google.protobuf.C34368g0;
import com.google.protobuf.C34448s;
import com.google.protobuf.C34504y1;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ResourceInfo extends GeneratedMessageLite<ResourceInfo, C34540b> implements C34576k {
    /* access modifiers changed from: private */
    public static final ResourceInfo DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 4;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile C34504y1<ResourceInfo> PARSER = null;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 2;
    public static final int RESOURCE_TYPE_FIELD_NUMBER = 1;
    private String description_ = "";
    private String owner_ = "";
    private String resourceName_ = "";
    private String resourceType_ = "";

    /* renamed from: com.google.rpc.ResourceInfo$a */
    public static /* synthetic */ class C34539a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f83628a;

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
                f83628a = r0
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f83628a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.NEW_BUILDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f83628a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f83628a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f83628a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_PARSER     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f83628a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f83628a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.GeneratedMessageLite$MethodToInvoke r1 = com.google.protobuf.GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.rpc.ResourceInfo.C34539a.<clinit>():void");
        }
    }

    /* renamed from: com.google.rpc.ResourceInfo$b */
    public static final class C34540b extends GeneratedMessageLite.C34263b<ResourceInfo, C34540b> implements C34576k {
        public /* synthetic */ C34540b(C34539a aVar) {
            this();
        }

        /* renamed from: P */
        public C34540b mo101932P() {
            mo100457F();
            ((ResourceInfo) this.f83053b).clearDescription();
            return this;
        }

        /* renamed from: R */
        public C34540b mo101933R() {
            mo100457F();
            ((ResourceInfo) this.f83053b).clearOwner();
            return this;
        }

        /* renamed from: S */
        public C34540b mo101934S() {
            mo100457F();
            ((ResourceInfo) this.f83053b).clearResourceName();
            return this;
        }

        /* renamed from: T */
        public C34540b mo101935T() {
            mo100457F();
            ((ResourceInfo) this.f83053b).clearResourceType();
            return this;
        }

        /* renamed from: U */
        public C34540b mo101936U(String str) {
            mo100457F();
            ((ResourceInfo) this.f83053b).setDescription(str);
            return this;
        }

        /* renamed from: V */
        public C34540b mo101937V(ByteString byteString) {
            mo100457F();
            ((ResourceInfo) this.f83053b).setDescriptionBytes(byteString);
            return this;
        }

        /* renamed from: Y */
        public C34540b mo101938Y(String str) {
            mo100457F();
            ((ResourceInfo) this.f83053b).setOwner(str);
            return this;
        }

        /* renamed from: Z */
        public C34540b mo101939Z(ByteString byteString) {
            mo100457F();
            ((ResourceInfo) this.f83053b).setOwnerBytes(byteString);
            return this;
        }

        /* renamed from: a0 */
        public C34540b mo101940a0(String str) {
            mo100457F();
            ((ResourceInfo) this.f83053b).setResourceName(str);
            return this;
        }

        /* renamed from: b0 */
        public C34540b mo101941b0(ByteString byteString) {
            mo100457F();
            ((ResourceInfo) this.f83053b).setResourceNameBytes(byteString);
            return this;
        }

        /* renamed from: c0 */
        public C34540b mo101942c0(String str) {
            mo100457F();
            ((ResourceInfo) this.f83053b).setResourceType(str);
            return this;
        }

        /* renamed from: d0 */
        public C34540b mo101943d0(ByteString byteString) {
            mo100457F();
            ((ResourceInfo) this.f83053b).setResourceTypeBytes(byteString);
            return this;
        }

        public String getDescription() {
            return ((ResourceInfo) this.f83053b).getDescription();
        }

        public ByteString getDescriptionBytes() {
            return ((ResourceInfo) this.f83053b).getDescriptionBytes();
        }

        public String getOwner() {
            return ((ResourceInfo) this.f83053b).getOwner();
        }

        public ByteString getOwnerBytes() {
            return ((ResourceInfo) this.f83053b).getOwnerBytes();
        }

        public String getResourceName() {
            return ((ResourceInfo) this.f83053b).getResourceName();
        }

        public ByteString getResourceNameBytes() {
            return ((ResourceInfo) this.f83053b).getResourceNameBytes();
        }

        public String getResourceType() {
            return ((ResourceInfo) this.f83053b).getResourceType();
        }

        public ByteString getResourceTypeBytes() {
            return ((ResourceInfo) this.f83053b).getResourceTypeBytes();
        }

        public C34540b() {
            super(ResourceInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        ResourceInfo resourceInfo = new ResourceInfo();
        DEFAULT_INSTANCE = resourceInfo;
        GeneratedMessageLite.registerDefaultInstance(ResourceInfo.class, resourceInfo);
    }

    private ResourceInfo() {
    }

    /* access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* access modifiers changed from: private */
    public void clearOwner() {
        this.owner_ = getDefaultInstance().getOwner();
    }

    /* access modifiers changed from: private */
    public void clearResourceName() {
        this.resourceName_ = getDefaultInstance().getResourceName();
    }

    /* access modifiers changed from: private */
    public void clearResourceType() {
        this.resourceType_ = getDefaultInstance().getResourceType();
    }

    public static ResourceInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C34540b newBuilder() {
        return (C34540b) DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceInfo parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C34504y1<ResourceInfo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setDescription(String str) {
        str.getClass();
        this.description_ = str;
    }

    /* access modifiers changed from: private */
    public void setDescriptionBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.description_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setOwner(String str) {
        str.getClass();
        this.owner_ = str;
    }

    /* access modifiers changed from: private */
    public void setOwnerBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.owner_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setResourceName(String str) {
        str.getClass();
        this.resourceName_ = str;
    }

    /* access modifiers changed from: private */
    public void setResourceNameBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.resourceName_ = byteString.mo99228S0();
    }

    /* access modifiers changed from: private */
    public void setResourceType(String str) {
        str.getClass();
        this.resourceType_ = str;
    }

    /* access modifiers changed from: private */
    public void setResourceTypeBytes(ByteString byteString) {
        C34319a.checkByteStringIsUtf8(byteString);
        this.resourceType_ = byteString.mo99228S0();
    }

    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C34539a.f83628a[methodToInvoke.ordinal()]) {
            case 1:
                return new ResourceInfo();
            case 2:
                return new C34540b((C34539a) null);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"resourceType_", "resourceName_", "owner_", "description_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                C34504y1<ResourceInfo> y1Var = PARSER;
                if (y1Var == null) {
                    synchronized (ResourceInfo.class) {
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

    public String getDescription() {
        return this.description_;
    }

    public ByteString getDescriptionBytes() {
        return ByteString.m137260e0(this.description_);
    }

    public String getOwner() {
        return this.owner_;
    }

    public ByteString getOwnerBytes() {
        return ByteString.m137260e0(this.owner_);
    }

    public String getResourceName() {
        return this.resourceName_;
    }

    public ByteString getResourceNameBytes() {
        return ByteString.m137260e0(this.resourceName_);
    }

    public String getResourceType() {
        return this.resourceType_;
    }

    public ByteString getResourceTypeBytes() {
        return ByteString.m137260e0(this.resourceType_);
    }

    public static C34540b newBuilder(ResourceInfo resourceInfo) {
        return (C34540b) DEFAULT_INSTANCE.createBuilder(resourceInfo);
    }

    public static ResourceInfo parseDelimitedFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (ResourceInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static ResourceInfo parseFrom(ByteBuffer byteBuffer, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ResourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, g0Var);
    }

    public static ResourceInfo parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResourceInfo parseFrom(ByteString byteString, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ResourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, g0Var);
    }

    public static ResourceInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceInfo parseFrom(byte[] bArr, C34368g0 g0Var) throws InvalidProtocolBufferException {
        return (ResourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, g0Var);
    }

    public static ResourceInfo parseFrom(InputStream inputStream) throws IOException {
        return (ResourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceInfo parseFrom(InputStream inputStream, C34368g0 g0Var) throws IOException {
        return (ResourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, g0Var);
    }

    public static ResourceInfo parseFrom(C34448s sVar) throws IOException {
        return (ResourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar);
    }

    public static ResourceInfo parseFrom(C34448s sVar, C34368g0 g0Var) throws IOException {
        return (ResourceInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, sVar, g0Var);
    }
}
