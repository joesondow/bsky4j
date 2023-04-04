package bsky4j.util;

import bsky4j.model.bsky.embed.EmbedExternal;
import bsky4j.model.bsky.embed.EmbedImages;
import bsky4j.model.bsky.embed.EmbedUnion;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;

public class EmbedSerializer implements JsonSerializer<EmbedUnion> {

    @Override
    public JsonElement serialize(
            EmbedUnion src,
            Type typeOfSrc,
            JsonSerializationContext context
    ) {
        if (src instanceof EmbedImages) {
            return context.serialize(src, EmbedImages.class);
        }
        if (src instanceof EmbedExternal) {
            return context.serialize(src, EmbedExternal.class);
        }
        return null;
    }
}
