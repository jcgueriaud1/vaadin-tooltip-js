import Tooltip from "tooltip.js";

window.initTooltip = function(element, description) {
    const tooltip = new Tooltip(element, {
        title: description,
        trigger: "hover",
        placement: "top"
    });
};