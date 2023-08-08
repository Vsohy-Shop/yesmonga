package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.C11076d0;
import kotlin.collections.C10975r0;
import kotlin.collections.C10977s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u000e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000e\u0010\u000fB\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001e\u0010\f\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, mo22516d2 = {"Lkotlin/collections/builders/SerializedMap;", "Ljava/io/Externalizable;", "", "readResolve", "Ljava/io/ObjectOutput;", "output", "Lkotlin/d2;", "writeExternal", "Ljava/io/ObjectInput;", "input", "readExternal", "", "map", "Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "()V", "a", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
final class SerializedMap implements Externalizable {
    @C12579k

    /* renamed from: a */
    public static final C10919a f28162a = new C10919a((DefaultConstructorMarker) null);
    private static final long serialVersionUID = 0;
    @C12579k
    private Map<?, ?> map;

    /* renamed from: kotlin.collections.builders.SerializedMap$a */
    public static final class C10919a {
        public /* synthetic */ C10919a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C10919a() {
        }
    }

    public SerializedMap(@C12579k Map<?, ?> map2) {
        Intrinsics.checkNotNullParameter(map2, "map");
        this.map = map2;
    }

    private final Object readResolve() {
        return this.map;
    }

    public void readExternal(@C12579k ObjectInput objectInput) {
        Intrinsics.checkNotNullParameter(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                Map h = C10975r0.m41398h(readInt);
                for (int i = 0; i < readInt; i++) {
                    h.put(objectInput.readObject(), objectInput.readObject());
                }
                this.map = C10975r0.m41394d(h);
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + '.');
        }
        throw new InvalidObjectException("Unsupported flags value: " + readByte);
    }

    public void writeExternal(@C12579k ObjectOutput objectOutput) {
        Intrinsics.checkNotNullParameter(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.map.size());
        for (Map.Entry next : this.map.entrySet()) {
            objectOutput.writeObject(next.getKey());
            objectOutput.writeObject(next.getValue());
        }
    }

    public SerializedMap() {
        this(C10977s0.m41492z());
    }
}
