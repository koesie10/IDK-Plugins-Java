importPackage(com.koenv.idk.essentials);
/**
 * Plugin Information
 * name, description
**/
var plugin = {
	'name' 	      : 'Essentials Plugin',
	'description' : 'Contains many essential commands.'
};

function initializePlugin() {
    new Essentials(IDK).onLoad();
}