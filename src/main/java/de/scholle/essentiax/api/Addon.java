package de.scholle.essentiax.api;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Jedes EssentiaX-Addon muss dieses Interface implementieren.
 *
 * <p>Beispiel:</p>
 * <pre>{@code
 * public class MyAddon implements Addon {
 *     @Override
 *     public void onEnable(JavaPlugin core) {
 *         core.getLogger().info("[MyAddon] aktiviert!");
 *     }
 *
 *     @Override
 *     public void onDisable() {
 *         EssentiaXAPI.getCore().getLogger().info("[MyAddon] deaktiviert!");
 *     }
 * }
 * }</pre>
 */
public interface Addon {

    /**
     * Wird aufgerufen, wenn das Addon geladen und aktiviert wird.
     *
     * @param core Instanz des EssentiaX-Core-Plugins
     */
    void onEnable(JavaPlugin core);

    /**
     * Wird aufgerufen, wenn das Addon deaktiviert wird (z. B. beim Server-Stop).
     */
    void onDisable();

    /**
     * Optional: der Name des Addons.
     *
     * @return der Addon-Name
     */
    default String getName() {
        return getClass().getSimpleName();
    }
}
