package org.smartgiveaway.boot;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
    info =
        @Info(
            version = "",
            title = "SmartGiveAway",
            description =
                "Seamlessly create a giveaway on xDai blockchain to gain user engagement on your social network.",
            contact =
                @Contact(name = "Abdelhamid Bakhta", email = "abdelhamid.bakhta@consensys.net"),
            license =
                @License(name = "Apache-2.0", url = "http://www.apache.org/licenses/LICENSE-2.0")),
    servers = {@Server(url = "http://localhost:8080")})
public class OpenAPIConfiguration {}
