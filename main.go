package main

import (
	"fmt"

	"github.com/NUS-ISS-Agile-Team/ceramicraft-customer-backend/common/logger"
	"github.com/NUS-ISS-Agile-Team/ceramicraft-customer-backend/config"
	"github.com/NUS-ISS-Agile-Team/ceramicraft-customer-backend/http/router"
	"github.com/NUS-ISS-Agile-Team/ceramicraft-customer-backend/repository"
)

func main() {
	initAll()
	r := router.NewRouter()
	logger.GetLogger().Info("Cerami Craft MerchantServer start...")
	_ = r.Run(fmt.Sprintf("%s:%s", config.Config.System.Host, config.Config.System.Port))
}

func initAll() {
	config.InitConfig()
	repository.Init()
}
