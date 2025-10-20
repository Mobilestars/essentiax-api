package de.scholle.essentiax.api;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Zentrale Zugriffsklasse für die EssentiaX-API.
 * <p>
 * Wird vom Core-Plugin beim Start initialisiert, damit Addons
 * auf globale Funktionen zugreifen können.
 * </p>
 *
 * Beispiel:
 * <pre>{@code
 * JavaPlugin core = EssentiaXAPI.getCore();
 * core.getLogger().info("Hello from Addon!");
 * }</pre>
 */
public class EssentiaXAPI {

    private static JavaPlugin core;

    /**
     * Wird vom EssentiaX-Core einmalig beim Start gesetzt.
     *
     * @param plugin Instanz des Core-Plugins
     */
    public static void init(JavaPlugin plugin) {
        core = plugin;
    }

    /**
     * Gibt die aktuelle Instanz des EssentiaX-Core-Plugins zurück.
     *
     * @return JavaPlugin-Instanz
     */
    public static JavaPlugin getCore() {
        if (core == null) {
            throw new IllegalStateException("EssentiaXAPI wurde noch nicht initialisiert!");
        }
        return core;
    }
}
