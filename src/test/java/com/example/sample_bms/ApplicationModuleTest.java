package com.example.sample_bms;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

public class ApplicationModuleTest {

    ApplicationModules modules = ApplicationModules.of(SampleBmsApplication.class);

    @Test
    void verifiesModularStructure() {
        modules.verify();
    }

}
