package com.vvcoders.project.gosaferides.goSafeRides.utils;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.locationtech.jts.geom.Point;

import java.io.IOException;

public class PointSerializer extends JsonSerializer<Point> {

    @Override
    public void serialize(Point value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        gen.writeArrayFieldStart("coordinates");
        gen.writeNumber(value.getX()); // Longitude
        gen.writeNumber(value.getY()); // Latitude
        gen.writeEndArray();
        gen.writeEndObject();
    }
}
