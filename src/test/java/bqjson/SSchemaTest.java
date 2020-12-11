package bqjson;

import bqjson.surrogate.SSchema;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import bqjson.context.TestContext;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

class SSchemaTest {
    TestContext context;

    @BeforeEach
    void setUp() throws IOException, InterruptedException {
        context = TestContext.getInstance();
    }

    @Test
    void toSchema() {
        SSchema sSchema = new SSchema(context.schema);
        assertThat(sSchema.toSchema()).isEqualTo(context.schema);
    }

    @Test
    void getFields() {
        SSchema sSchema = new SSchema(context.schema);
        assertThat(sSchema.getFields()).isEqualTo(context.schema.getFields());
    }
}