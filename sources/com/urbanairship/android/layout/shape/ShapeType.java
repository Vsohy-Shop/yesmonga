package com.urbanairship.android.layout.shape;

import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.json.JsonException;
import java.util.Locale;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public enum ShapeType {
    RECTANGLE("rectangle", 0),
    ELLIPSE("ellipse", 1);
    
    private final int drawableShape;
    @C0359n0
    private final String value;

    /* access modifiers changed from: public */
    ShapeType(@C0359n0 String str, int i) {
        this.value = str;
        this.drawableShape = i;
    }

    @C0359n0
    /* renamed from: b */
    public static ShapeType m147947b(@C0359n0 String str) throws JsonException {
        for (ShapeType shapeType : values()) {
            if (shapeType.value.equals(str.toLowerCase(Locale.ROOT))) {
                return shapeType;
            }
        }
        throw new JsonException("Unknown ShapeType value: " + str);
    }

    /* renamed from: g */
    public int mo107475g() {
        return this.drawableShape;
    }

    @C0359n0
    public String toString() {
        return name().toLowerCase(Locale.ROOT);
    }
}
